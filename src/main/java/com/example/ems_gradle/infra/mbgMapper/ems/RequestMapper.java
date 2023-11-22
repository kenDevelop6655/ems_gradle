package com.example.ems_gradle.infra.mbgMapper.ems;

import com.example.ems_gradle.domain.mbgModel.ems.Request;
import com.example.ems_gradle.domain.mbgModel.ems.RequestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RequestMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.request
     *
     * @mbg.generated Sat Sep 02 09:13:33 JST 2023
     */
    long countByExample(RequestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.request
     *
     * @mbg.generated Sat Sep 02 09:13:33 JST 2023
     */
    int deleteByExample(RequestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.request
     *
     * @mbg.generated Sat Sep 02 09:13:33 JST 2023
     */
    int deleteByPrimaryKey(Integer requestId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.request
     *
     * @mbg.generated Sat Sep 02 09:13:33 JST 2023
     */
    int insert(Request row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.request
     *
     * @mbg.generated Sat Sep 02 09:13:33 JST 2023
     */
    int insertSelective(Request row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.request
     *
     * @mbg.generated Sat Sep 02 09:13:33 JST 2023
     */
    List<Request> selectByExample(RequestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.request
     *
     * @mbg.generated Sat Sep 02 09:13:33 JST 2023
     */
    Request selectByPrimaryKey(Integer requestId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.request
     *
     * @mbg.generated Sat Sep 02 09:13:33 JST 2023
     */
    int updateByExampleSelective(@Param("row") Request row, @Param("example") RequestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.request
     *
     * @mbg.generated Sat Sep 02 09:13:33 JST 2023
     */
    int updateByExample(@Param("row") Request row, @Param("example") RequestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.request
     *
     * @mbg.generated Sat Sep 02 09:13:33 JST 2023
     */
    int updateByPrimaryKeySelective(Request row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.request
     *
     * @mbg.generated Sat Sep 02 09:13:33 JST 2023
     */
    int updateByPrimaryKey(Request row);
}