namespace java com.asksunny.rpc.gateway
namespace perl rpc.gateway
namespace cpp rpc.gateway
namespace py rpc.gateway

enum DataType {
	STRING = 0,
	INTEGER = 1,
	LONG = 2,
	DOUBLE = 3,
	SHORT = 4,
		
	STRING_ARRAY = 20,
	INTEGER_ARRAY = 21,
	LONG_ARRAY = 22,
	DOUBLE_ARRAY = 23,
	SHORT_ARRAY = 24,
	
	JSON = 41,
	XML = 42,	
	
	VOID = 99,
}

struct JPValueObject{
	1: required DataType type,
	2: required string value,
}


typedef list<JPValueObject> JPValueObjectList
typedef list<string> JPValueList
typedef list<JPValueList> JPValueListCollection


struct JPQueryParamMetaData{
	1: required i32 type,
	2: required i32 mode,
	3: optional string typeName,
	4: optional bool signed,
	5: optional bool nullable,
	6: optional i32 precision,
	7: optional i32 scale,	
	8: optional string className,
}

struct JPQueryParameter{	
	1: required i32 index,
	2: optional string value,
	3: optional i32 type,	
}

struct JPParameterMetaData{	
	1: required string statementId,
	2: required i32 paramCount,
	3: optional JPQueryParamMetaDataList params,
}


typedef list<JPQueryParameter> JPQueryParameterList

typedef list<JPQueryParamMetaData> JPQueryParamMetaDataList




struct JPColumnMetaData{
	1: required i32 columnType,
	2: required i32 columnDisplaySize,
	3: required string columnLabel,
	4: optional string columnName,
	5: optional string columnTypeName,
	6: optional i32 precision,
	7: optional i32 scale,
	8: optional string tableName,
	9: optional string schemaName,
	10: optional string catalogName,
	11: optional string columnClassName,	
	12: optional bool nullable,
	13: optional bool readOnly,		
	14: optional bool autoIncrement,
	15: optional bool caseSensitive,
	16: optional bool definitelyWritable,
	17: optional bool currency,	
	18: optional bool searchable,
	19: optional bool signed,
	20: optional bool writable,
}

typedef list<JPColumnMetaData> JPColumnMetaDataList
struct JPResultSetMetaData{
	1: required string resultSetId,
	2: required i32 columnCount,
	3: required JPColumnMetaDataList columnMetaDatas,
}

struct JPSimpleQueryResultSet{
	1: required JPResultSetMetaData resultMetaData,
	2: required JPValueListCollection dataRows,	
}


exception InvocationException {
  1: required i32 errorCode,
  2: required string sqlstate,
  3: optional string message
}



service RpcGateway{
	i64 ping(),
	JPResultSetMetaData executeQuery(1: required JPValueObjectList parameters) throws (1:InvocationException error) ,
	JPSimpleQueryResultSet executeSimpleQuery(1: required string datasource, 2: required string query) throws (1:InvocationException error) ,
	i32 executeUpdate(1: required string datasource, 2: required string query) throws (1:InvocationException error) ,		
	JPParameterMetaData prepareQuery(1: required JPValueObjectList parameters) throws (1:InvocationException error) ,
	JPResultSetMetaData executePreparedQuery(1: required JPValueObjectList parameters, 2:  JPQueryParameterList queryParameters) throws (1:InvocationException error),	
	i32 executePreparedUpdate(1: required JPValueObjectList parameters, 2:  JPQueryParameterList queryParameters) throws (1:InvocationException error) ,		
	JPParameterMetaData prepareCallableQuery(1: required JPValueObjectList parameters) throws (1:InvocationException error) ,
	JPResultSetMetaData executeCallableQuery(1: required JPValueObjectList parameters, 2:  JPQueryParameterList queryParameters) throws (1:InvocationException error),
	i32 executeCallableUpdate(1: required JPValueObjectList parameters, 2:  JPQueryParameterList queryParameters) throws (1:InvocationException error) ,		
	JPValueListCollection fetchResult(1: JPValueObjectList parameters) throws (1:InvocationException error),	
	
	JPValueListCollection executeComplexCommand(1: JPValueObjectList parameters) throws (1:InvocationException error),
	JPValueObject executeCommand(1: JPValueObjectList parameters) throws (1:InvocationException error),
	string executeSimpleCommand(1: JPValueObjectList parameters) throws (1:InvocationException error),
}


