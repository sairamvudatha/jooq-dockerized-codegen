-- Initial Schema
CREATE TABLE IF NOT EXISTS `books`
  (
     `id`           CHAR(36),
     `name`         VARCHAR(191) NOT NULL,
     `description`  VARCHAR(1000),
     `created_at`   DATETIME(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
     `updated_at`   DATETIME(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
     PRIMARY KEY (`id`)
  );

CREATE TABLE IF NOT EXISTS `authors`
  (
     `id`         CHAR(36),
     `name`       VARCHAR(40) NOT NULL,
     `created_at` DATETIME(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
     `updated_at` DATETIME(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
     PRIMARY KEY (`id`)
  );

CREATE TABLE IF NOT EXISTS `author_book_relations`
  (
     `author_id` CHAR(36),
     `book_id` CHAR(36),
     PRIMARY KEY (`author_id`, `book_id`),
     FOREIGN KEY (`author_id`) REFERENCES authors (`id`),
     FOREIGN KEY (`book_id`) REFERENCES books (`id`)
  );
