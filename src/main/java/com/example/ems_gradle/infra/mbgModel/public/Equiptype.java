package com.example.ems_gradle.infra.mbgModel.public;

public class Equiptype {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.EquipType.equip_type_id
     *
     * @mbg.generated Mon Aug 07 22:08:05 JST 2023
     */
    private Integer equipTypeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.EquipType.equip_type
     *
     * @mbg.generated Mon Aug 07 22:08:05 JST 2023
     */
    private String equipType;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.EquipType.equip_type_id
     *
     * @return the value of public.EquipType.equip_type_id
     *
     * @mbg.generated Mon Aug 07 22:08:05 JST 2023
     */
    public Integer getEquipTypeId() {
        return equipTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.EquipType.equip_type_id
     *
     * @param equipTypeId the value for public.EquipType.equip_type_id
     *
     * @mbg.generated Mon Aug 07 22:08:05 JST 2023
     */
    public void setEquipTypeId(Integer equipTypeId) {
        this.equipTypeId = equipTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.EquipType.equip_type
     *
     * @return the value of public.EquipType.equip_type
     *
     * @mbg.generated Mon Aug 07 22:08:05 JST 2023
     */
    public String getEquipType() {
        return equipType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.EquipType.equip_type
     *
     * @param equipType the value for public.EquipType.equip_type
     *
     * @mbg.generated Mon Aug 07 22:08:05 JST 2023
     */
    public void setEquipType(String equipType) {
        this.equipType = equipType == null ? null : equipType.trim();
    }
}