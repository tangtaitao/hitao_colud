
package com.hzitxx.hitao.utils;
import java.util.List;


public class ShopCategoryUtils {

    private List<AttrTemp> attrTemp;
    private String catId;
    public void setAttrTemp(List<AttrTemp> attrTemp) {
         this.attrTemp = attrTemp;
     }
     public List<AttrTemp> getAttrTemp() {
         return attrTemp;
     }

    public void setCatId(String catId) {
         this.catId = catId;
     }
     public String getCatId() {
         return catId;
     }
	@Override
	public String toString() {
		return "ShopCategoryUtils [attrTemp=" + attrTemp + ", catId=" + catId + "]";
	}

}
