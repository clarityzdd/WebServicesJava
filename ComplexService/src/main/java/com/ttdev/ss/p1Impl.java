package com.ttdev.ss;

import java.util.List;

import com.ttdev.ss.ProductQueryComplexType.QueryItem;
import com.ttdev.ss.ProductQueryResult.ResultItem;

public class p1Impl implements SimpleService {

	@Override
	public ProductQueryResult query(ProductQueryComplexType parameters) {
		ProductQueryResult result = new ProductQueryResult();
		List<QueryItem> queryItem = parameters.getQueryItem();
		for(QueryItem item : queryItem) {
			if(item.getQty() <= 200) {
				ResultItem resultItem = new ResultItem();
				resultItem.setProductId(item.getProductId());
				resultItem.setPrice(20);
				result.getResultItem().add(resultItem);
			}
		}
		
		return result;
	}

	@Override
	public String concat(String s1, String s2) {
		// TODO Auto-generated method stub
		return null;
	}

}
