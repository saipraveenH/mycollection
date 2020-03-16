/**
 * 
 */
package com.otsi.collections.stream;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.otsi.collections.helpers.Staff;

/**
 * @author praveen.hemadri
 *
 */
public class TestExample5 {
	public static void main(String[] args) {

		List<Staff> staff = Arrays.asList(new Staff("mkyong", 30, new BigDecimal(10000)),
				new Staff("jack", 27, new BigDecimal(20000)), new Staff("lawrence", 33, new BigDecimal(30000)));
		// List of objects -> List of String
		List<String> result = null;
		result = staff.stream().map(staffMember -> staffMember.getName()).collect(Collectors.toList());
	}
}
