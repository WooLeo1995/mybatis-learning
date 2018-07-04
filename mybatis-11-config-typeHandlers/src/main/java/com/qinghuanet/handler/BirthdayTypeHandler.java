package com.qinghuanet.handler;

import com.qinghuanet.domain.Birthday;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.*;
import java.util.Calendar;

/**
 * MyBatis 将通过当前类型处理器在JavaBean与数据库列属性之间进行转换
 *
 * @author qinghua
 * @date 2018/6/22 11:10
 */
public class BirthdayTypeHandler extends BaseTypeHandler<Birthday> {

    /**
     * 设置参数
     * JavaBean -> Statement 参数
     *
     * @param ps 预编译语句
     * @param i 占位符的位置
     * @param parameter 待处理的Birthday
     * @param jdbcType
     * @throws SQLException
     */
    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, Birthday parameter, JdbcType jdbcType) throws SQLException {
        Calendar calendar = Calendar.getInstance();
        calendar.set(
                Integer.valueOf(parameter.getYear()),
                Integer.valueOf(parameter.getMonth()),
                Integer.valueOf(parameter.getDay()));
        Date date = new Date(calendar.getTimeInMillis());
        //设置参数
        ps.setDate(i, date);
    }

    /**
     * 根据columnName封装结果集
     * ResultSet -> JavaBean
     *
     * @param rs 结果集
     * @param columnName 列名称
     * @return
     * @throws SQLException
     */
    @Override
    public Birthday getNullableResult(ResultSet rs, String columnName) throws SQLException {
        return new Birthday(rs.getString(columnName));
    }

    /**
     * 根据columnIndex
     * ResultSet -> JavaBean
     *
     * @param rs
     * @param columnIndex
     * @return
     * @throws SQLException
     */
    @Override
    public Birthday getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        return new Birthday(rs.getString(columnIndex));
    }

    /**
     * 从存储过程中封装结果集
     * CallableStatement -> JavaBean
     *
     * @param cs
     * @param columnIndex
     * @return
     * @throws SQLException
     */
    @Override
    public Birthday getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return new Birthday(cs.getString(columnIndex));
    }
}
