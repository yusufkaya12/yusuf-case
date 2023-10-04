package com.threepounds.caseproject.service;


import com.threepounds.caseproject.data.entity.Category;
import com.threepounds.caseproject.data.repository.CategoryRepository;
import java.util.List;
import java.util.UUID;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

  private CategoryRepository repository;

  public CategoryService(CategoryRepository repository) {
    this.repository = repository;
  }

  public Category save(Category category){
    return repository.save(category);
  }

  public List<Category> list(){
    return repository.findAll();
  }

  public void delete(UUID categoryId){
    repository.deleteById(categoryId);
  }
}
