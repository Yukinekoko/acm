package leetcode;

import java.util.*;

/**
 * <a href="https://leetcode.cn/problems/group-anagrams">problem</a>
 * @author snowmeow
 */
public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortStr = new String(chars);
            map.computeIfAbsent(sortStr, k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(map.values());
    }

}
