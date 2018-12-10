package com.hk.inface;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface MapperIf {

    Object mapperObj(ResultSet res) throws SQLException;

    Object mapperSave() throws SQLException;
}
