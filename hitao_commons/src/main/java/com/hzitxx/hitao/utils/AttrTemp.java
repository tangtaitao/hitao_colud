package com.hzitxx.hitao.utils;
import java.util.List;

/**
 *类目工具类
 *
 */
public class AttrTemp {

    private List<AttrArr> attrArr;
    private String groupName;
    public void setAttrArr(List<AttrArr> attrArr) {
         this.attrArr = attrArr;
     }
     public List<AttrArr> getAttrArr() {
         return attrArr;
     }

    public void setGroupName(String groupName) {
         this.groupName = groupName;
     }
     public String getGroupName() {
         return groupName;
     }
	@Override
	public String toString() {
		return "AttrTemp [attrArr=" + attrArr + ", groupName=" + groupName + "]";
	}

}