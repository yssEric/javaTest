package com.hk.entity;

import com.hk.inface.MapperIf;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @program: javaTest
 * @description: 数据处理
 * @author: Mr.Yi
 * @create: 2018-11-30 11:19
 **/
public class saveDao {


    /**
     * 保存数据
     */
    public static void save() {
        /*dataModel model = new dataModel();
        model.setName("xiaoming");
        model.setAge("12");

        DbHelper.save("insert into t_age(age,nameStr) values (?,?)",model.getName(),model.getAge());*/

        DbHelper.save("insert into t_age(age,nameStr) values (?,?)",new saveDao().new MapperEn());
    }

    /**
     * 查询单个元素
     * @return
     */
    public static dataModel getData() {

        return (dataModel) DbHelper.getData("select *from t_age where nameStr =?", new saveDao().new MapperEn(),"12");
    }

    /**
     * 查询集合元素
     * @return
     */
    public static List getListData() {
        return DbHelper.getListData("select *from t_age where nameStr =?", new saveDao().new MapperEn(),"12");
    }

    /**
     * 私有内部类（只有本类使用，这种写法最佳）
     */
    private class MapperEn implements MapperIf {

        @Override
        public Object mapperObj(ResultSet res) throws SQLException {

            dataModel model = new dataModel();
            model.setAge(res.getString("age"));
            model.setName(res.getString("nameStr"));

            return model;
        }

        @Override
        public Object mapperSave() throws SQLException {

            dataModel model = new dataModel();
            model.setAge("3333");
            model.setName("44444");
            return model;
        }
    }
}

