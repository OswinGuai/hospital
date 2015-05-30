/**
 * 
 */
package com.alipay.util;

import java.util.Comparator;

import org.dom4j.Element;

/**
 * @description 
 * @author Pei Zhongyi
 * @date 2015年5月30日 上午9:21:26
 *
 */
public class ComparatorUtil {

    private static class DocComparator implements Comparator<Element> {
        
        @Override
        public int compare(Element ele1, Element ele2) {
            return ele1.getName().compareTo(ele2.getName());
        }
    }
    
    public static Comparator<Element> getDocComparator() {
        return new DocComparator();
    }
}
