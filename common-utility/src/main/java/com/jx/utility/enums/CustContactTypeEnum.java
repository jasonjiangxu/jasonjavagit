package com.jx.utility.enums;

/**
 * 客户联系人类型枚举
 * @author Administrator
 *
 */
public enum CustContactTypeEnum {
	
	OWNER("10054001", "业主"),PARENT("10054002", "父母"),RELATIVE("10054003","亲戚"),
	FRIEND("10054004","朋友"),MEDIATIONS("10054005","中介"),CLIENT("10054006","客户"),
	ELSE("10054007","其他");
	
    private String code;
    private String name;
    
    private CustContactTypeEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    /**
     * 根据code获取Name
     * @param code
     * @return
     */
    public static String getName(String code) {
        for (CustContactTypeEnum sde : CustContactTypeEnum.values()) {
            if (code.equalsIgnoreCase(sde.getCode())){
                return sde.getName();
            }
        }
        return null;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
}
