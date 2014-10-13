package exam.shop.dao;

import java.util.List;

import exam.shop.dto.ItemDTO;

public interface ItemDAO {
	public List<ItemDTO> findAll();

}
