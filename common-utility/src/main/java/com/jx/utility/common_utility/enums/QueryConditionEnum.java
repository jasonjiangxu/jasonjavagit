package com.jx.utility.common_utility.enums;

/**
 * 状态枚举类型
 * @author Lenovo
 */
public enum QueryConditionEnum {
	
	LIKE("0", " LIKE "), 
	LIKESTART("01", " LIKE "), 
	LIKEEND("02", " LIKE "), 
	EQ("2", "="),
	NOTEQ("3", "<> "),
	LT("4", "< "), 
	GT("5", "> "),
	LTE("6", "<= "),
	GTE("7", ">= "),
	AND("8", " AND "),
	OR("9", " OR "),
	IN("10", " IN "),
	ISNULL("11", " ISNULL "),
	ISNOTNULL("12", " IS NOT NULL "),
	WHERE("13", " WHERE "),
	DESC("14", " DESC "),
	ASC("15", " ASC "),
	FROM("16", " FROM  "),
	FROM_CT("17", " SELECT COUNT(1) CT FROM ")
	;
	
    private String code;

    private String name;

    private QueryConditionEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    /**
     * 根据code获取Name
     * 
     * @param code
     * @return
     */
    public static String getName(String code) {
        for (QueryConditionEnum sde : QueryConditionEnum.values()) {
            if (code.equalsIgnoreCase(sde.getCode())){
            	return sde.getName();
            }
        }
        return null;
    }
    /**
     * Getter method for property <tt>name</tt>.
     * 
     * @return property value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for property <tt>name</tt>.
     * 
     * @param name value to be assigned to property name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter method for property <tt>code</tt>.
     * 
     * @return property value of code
     */
    public String getCode() {
        return code;
    }

    /**
     * Setter method for property <tt>code</tt>.
     * 
     * @param code value to be assigned to property code
     */
    public void setCode(String code) {
        this.code = code;
    }
}
