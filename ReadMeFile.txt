In spring data jpa, Inheritance in database design can be represented in several ways.
Here are four different strategies :

1. MappedSuperClass :
-> No table for parent class is created.
-> Tables for child classes are created and attributes from parent are added to child class.
Pros :
-> It's easy to get info of particular user.
Cons :
-> In order to get all users info we need query on multiple tables.


2. Single Table (SINGLE_TABLE) :
-> In the Single Table strategy, a single table is used to store all the entities in the hierarchy.
   This table has a discriminator column that indicates the type of each record.
-> We can give column name and can give datatype like INTEGER,CHAR,STRING in @@DiscriminatorColumn.
-> @@DiscriminatorValue  here value mapped with datatype of column.
Pros :
-> Simplicity: Only one table.
-> Performance: No joins are needed to retrieve an entity.
Cons :
-> Potentially large table with many null values for fields not applicable to certain types.
-> Less normalized data structure.


3. Table Per Class (TABLE_PER_CLASS) :
-> In the Table Per Class strategy, each class in the hierarchy has its own table.
   There are no discriminator columns, and each table contains all fields for the class it represents.
Pros :
-> No null values since each table is specific to one entity type.
-> Clear and normalized structure.
Cons :
-> Retrieval of a base class type requires a UNION query.
-> Can be less efficient for polymorphic queries.


4. Joined Table (JOINED) :
-> In the Joined Table strategy, each class has its own table, and the tables are linked with foreign keys.

Pros :
-> Fully normalized data structure.
-> No null values for fields.
Cons :
-> Complex queries with joins.
-> Potentially less performance due to joins.