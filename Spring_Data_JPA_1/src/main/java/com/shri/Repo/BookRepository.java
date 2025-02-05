package com.shri.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.shri.Entity.Book;

@Repository  //Its Optional
public interface BookRepository extends CrudRepository<Book, Integer> {

}
