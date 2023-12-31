package com.example.ems_gradle.infra.mbgMapper.ems;

import com.example.ems_gradle.infra.mbgModel.ems.Requestequip;
import com.example.ems_gradle.infra.mbgModel.ems.RequestequipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RequestequipMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.RequestEquip
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    long countByExample(RequestequipExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.RequestEquip
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    int deleteByExample(RequestequipExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.RequestEquip
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    int deleteByPrimaryKey(Integer requestId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.RequestEquip
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    int insert(Requestequip row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.RequestEquip
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    int insertSelective(Requestequip row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.RequestEquip
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    List<Requestequip> selectByExample(RequestequipExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.RequestEquip
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    Requestequip selectByPrimaryKey(Integer requestId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.RequestEquip
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    int updateByExampleSelective(@Param("row") Requestequip row, @Param("example") RequestequipExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.RequestEquip
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    int updateByExample(@Param("row") Requestequip row, @Param("example") RequestequipExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.RequestEquip
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    int updateByPrimaryKeySelective(Requestequip row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.RequestEquip
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    int updateByPrimaryKey(Requestequip row);
}