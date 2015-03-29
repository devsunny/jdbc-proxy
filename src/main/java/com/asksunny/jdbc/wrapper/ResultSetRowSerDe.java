package com.asksunny.jdbc.wrapper;

import java.nio.ByteBuffer;
import java.sql.ResultSet;

public class ResultSetRowSerDe {

	public ResultSetRowSerDe() {
	}

	public byte[] serialize(ResultSet rs, int[] sqlTypes) {
		ByteBuffer buf = ByteBuffer.allocate(1024);

		return null;
	}

	public byte[] deserialize(ResultSet rs, int[] sqlTypes) {
		ByteBuffer buf = ByteBuffer.allocate(1024);

		return null;
	}

}
