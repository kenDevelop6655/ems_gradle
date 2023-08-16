package com.example.ems_gradle.infra.mbgMapper.ems;

import com.example.ems_gradle.domain.mbgModel.ems.Employee;
import com.example.ems_gradle.domain.mbgModel.ems.EmployeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmployeeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.employee
     *
     * @mbg.generated Wed Aug 16 22:37:18 JST 2023
     */
    long countByExample(EmployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.employee
     *
     * @mbg.generated Wed Aug 16 22:37:18 JST 2023
     */
    int deleteByExample(EmployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.employee
     *
     * @mbg.generated Wed Aug 16 22:37:18 JST 2023
     */
    int deleteByPrimaryKey(Integer empId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.employee
     *
     * @mbg.generated Wed Aug 16 22:37:18 JST 2023
     */
    int insert(Employee row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.employee
     *
     * @mbg.generated Wed Aug 16 22:37:18 JST 2023
     */
    int insertSelective(Employee row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.employee
     *
     * @mbg.generated Wed Aug 16 22:37:18 JST 2023
     */
    List<Employee> selectByExample(EmployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.employee
     *
     * @mbg.generated Wed Aug 16 22:37:18 JST 2023
     */
    Employee selectByPrimaryKey(Integer empId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.employee
     *
     * @mbg.generated Wed Aug 16 22:37:18 JST 2023
     */
    int updateByExampleSelective(@Param("row") Employee row, @Param("example") EmployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.employee
     *
     * @mbg.generated Wed Aug 16 22:37:18 JST 2023
     */
    int updateByExample(@Param("row") Employee row, @Param("example") EmployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.employee
     *
     * @mbg.generated Wed Aug 16 22:37:18 JST 2023
     */
    int updateByPrimaryKeySelective(Employee row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.employee
     *
     * @mbg.generated Wed Aug 16 22:37:18 JST 2023
     */
    int updateByPrimaryKey(Employee row);
}