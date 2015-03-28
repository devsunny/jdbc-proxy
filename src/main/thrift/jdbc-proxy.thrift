namespace java com.asksunny.jdbc.proxy
namespace perl jdbc.proxy
namespace cpp jdbc.proxy
namespace py jdbc.proxy


struct JPMethodParameter{
	1: required i32 type,
	2: required string value,
}


typedef list<JPMethodParameter> MethodParameterList

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

typedef list<string> JPValueList
typedef list<JPValueList> JPValueListCollection
typedef list<JPQueryParameter> JPQueryParameterList

typedef list<JPQueryParamMetaData> JPQueryParamMetaDataList

struct JPParameterMetaData{	
	1: required string statementId,
	2: required i32 paramCount,
	3: optional JPQueryParamMetaDataList params,
}


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


exception SQLInvocationException {
  1: required i32 errorCode,
  2: required string sqlstate,
  3: optional string message
}



service JdbcProxy{
	i64 ping()
	JPResultSetMetaData executeQuery(1: required MethodParameterList parameters) throws (1:SQLInvocationException error) ,
	JPSimpleQueryResultSet executeSimpleQuery(1: required string datasource, 2: required string query) throws (1:SQLInvocationException error) ,
	i32 executeUpdate(1: required string datasource, 2: required string query) throws (1:SQLInvocationException error) ,		
	JPParameterMetaData prepareQuery(1: required MethodParameterList parameters) throws (1:SQLInvocationException error) ,
	JPResultSetMetaData executePreparedQuery(1: required MethodParameterList parameters, 2:  JPQueryParameterList queryParameters) throws (1:SQLInvocationException error),	
	i32 executePreparedUpdate(1: required MethodParameterList parameters, 2:  JPQueryParameterList queryParameters) throws (1:SQLInvocationException error) ,		
	JPParameterMetaData prepareCallableQuery(1: required MethodParameterList parameters) throws (1:SQLInvocationException error) ,
	JPResultSetMetaData executeCallableQuery(1: required MethodParameterList parameters, 2:  JPQueryParameterList queryParameters) throws (1:SQLInvocationException error),
	i32 executeCallableUpdate(1: required MethodParameterList parameters, 2:  JPQueryParameterList queryParameters) throws (1:SQLInvocationException error) ,		
	JPValueListCollection fetchResult(1: MethodParameterList parameters) throws (1:SQLInvocationException error),	
	JPValueListCollection executeOsCommand(1: MethodParameterList parameters) throws (1:SQLInvocationException error),
	

}


