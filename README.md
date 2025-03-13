🔗 Technical Jobs & Companies – One-to-Many Bidirectional Association
This project demonstrates how to implement a One-to-Many Bidirectional Association in a Spring Boot application using Spring Data JPA and Hibernate.
It models a real-world relationship between technical jobs and companies, where:

A Company can have multiple Job Listings.
Each Job Listing belongs to a single Company.
This setup allows efficient data navigation, query optimization, and seamless management of job postings within companies.

🚀 Features
✔ One-to-Many Bidirectional Mapping using @OneToMany and @ManyToOne annotations
✔ Supports cascading operations (persist, merge, remove, etc.)
✔ Implements lazy vs. eager fetching strategies for performance optimization
✔ Provides CRUD APIs to manage Companies and Job Listings
✔ Uses Spring Boot, Spring Data JPA, Hibernate, and Lombok

🛠️ Tech Stack
🔹 Java (JDK 11/17)
🔹 Spring Boot (Spring Data JPA, Spring Web)
🔹 Hibernate (ORM framework)
🔹 MySQL/Oracle(Database)
🔹 Maven (Dependency Management)
🔹 Eclipse / IntelliJ IDEA (Recommended IDEs)

⚙️ Understanding One-to-Many Bidirectional Mapping
In a One-to-Many Bidirectional Association:

A Company can have multiple Job Listings.
Each Job Listing maintains a reference back to its Company, enabling seamless navigation in both directions.
🔹 Example Scenario:
One Company → has many Job Listings.
Each Job Listing → belongs to one Company.
This design ensures optimized queries, prevents redundant database calls, and maintains data consistency.
