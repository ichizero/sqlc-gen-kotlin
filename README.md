# sqlc-gen-kotlin-ichi

sqlc-gen-kotlin-ichi is a patched version of the 
[sqlc-gen-kotlin](https://github.com/sqlc-dev/sqlc-gen-kotlin).

v1.2.1 includes the following changes from the original v1.2.0:

- https://github.com/sqlc-dev/sqlc-gen-kotlin/pull/17
- https://github.com/sqlc-dev/sqlc-gen-kotlin/pull/22

## Usage

```yaml
version: '2'
plugins:
- name: kt
  wasm:
    url: https://github.com/ichizero/sqlc-gen-kotlin/releases/download/v1.2.1/sqlc-gen-kotlin-ichi_1.2.1.wasm
    sha256: fef0a4513c5c5dde711d88b2ef5c5da94eaf0c557691eae360d6278c2f4601b4
sql:
- schema: src/main/resources/authors/postgresql/schema.sql
  queries: src/main/resources/authors/postgresql/query.sql
  engine: postgresql
  codegen:
  - out: src/main/kotlin/com/example/authors/postgresql
    plugin: kt
    options:
      package: com.example.authors.postgresql
```
