package com.example.ems_gradle.infra.mbgMapper.ems;

import com.example.ems_gradle.domain.mbgModel.ems.ManageEquip;
import com.example.ems_gradle.domain.mbgModel.ems.ManageEquipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ManageEquipMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.manage_equip
     *
     * @mbg.generated Wed Aug 16 22:37:18 JST 2023
     */
    long countByExample(ManageEquipExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.manage_equip
     *
     * @mbg.generated Wed Aug 16 22:37:18 JST 2023
     */
    int deleteByExample(ManageEquipExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.manage_equip
     *
     * @mbg.generated Wed Aug 16 22:37:18 JST 2023
     */
    int deleteByPrimaryKey(Integer equipId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.manage_equip
     *
     * @mbg.generated Wed Aug 16 22:37:18 JST 2023
     */
    int insert(ManageEquip row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.manage_equip
     *
     * @mbg.generated Wed Aug 16 22:37:18 JST 2023
     */
    int insertSelective(ManageEquip row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.manage_equip
     *
     * @mbg.generated Wed Aug 16 22:37:18 JST 2023
     */
    List<ManageEquip> selectByExample(ManageEquipExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.manage_equip
     *
     * @mbg.generated Wed Aug 16 22:37:18 JST 2023
     */
    ManageEquip selectByPrimaryKey(Integer equipId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.manage_equip
     *
     * @mbg.generated Wed Aug 16 22:37:18 JST 2023
     */
    int updateByExampleSelective(@Param("row") ManageEquip row, @Param("example") ManageEquipExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.manage_equip
     *
     * @mbg.generated Wed Aug 16 22:37:18 JST 2023
     */
    int updateByExample(@Param("row") ManageEquip row, @Param("example") ManageEquipExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.manage_equip
     *
     * @mbg.generated Wed Aug 16 22:37:18 JST 2023
     */
    int updateByPrimaryKeySelective(ManageEquip row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.manage_equip
     *
     * @mbg.generated Wed Aug 16 22:37:18 JST 2023
     */
    int updateByPrimaryKey(ManageEquip row);
}