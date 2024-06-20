package com.pluralsight.northwindtradersapi.dao;

import com.pluralsight.northwindtradersapi.models.Category;
import com.pluralsight.northwindtradersapi.config.DbConfiguration;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class CategoryDAOImpl implements CategoryDAO {

    public CategoryDAOImpl(){}

    @Override
    public Category getCategoryById(int id) {
        Category categories = null;
        String query = "SELECT * FROM Categories WHERE CategoryID = ?";
        try (Connection connection = DbConfiguration.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                categories = new Category();
                categories.setCategoryId(resultSet.getInt("CategoryID"));
                categories.setCategoryName(resultSet.getString("CategoryName"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return categories;
    }

    @Override
    public List<Category> getAllCategories() {
        List<Category> categories = new ArrayList<>();
        String query = "SELECT * FROM Categories";

        try (Connection connection = DbConfiguration.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                Category category = new Category();
                category.setCategoryId(resultSet.getInt("CategoryID"));
                category.setCategoryName(resultSet.getString("CategoryName"));
                categories.add(category);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return categories;
    }
}
