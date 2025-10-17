package com.nitinkhandelwal.JournalApp.repository;

import com.nitinkhandelwal.JournalApp.entity.ConfigJournalAppEntity;
import com.nitinkhandelwal.JournalApp.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ConfigJournalAppRepository extends MongoRepository<ConfigJournalAppEntity, ObjectId> {

}
