package com.example.review_backend;
import java.util.List;
import javax.sql.DataSource;
public interface ItemDAO {

    public void setDataSource(DataSource ds);
    public List<Item> allItems();
}

   