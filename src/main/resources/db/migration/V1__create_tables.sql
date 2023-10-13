CREATE TABLE IF NOT EXISTS tags (
    name VARCHAR(128) PRIMARY KEY
);

CREATE TABLE IF NOT EXISTS todos (
    todo_id BIGSERIAL PRIMARY KEY,
    title VARCHAR(128) NOT NULL,
    description TEXT NOT NULL,
    completed BOOL NOT NULL
);

CREATE TABLE IF NOT EXISTS todos_tags (
    id BIGSERIAL PRIMARY KEY,
    todo_id BIGINT NOT NULL REFERENCES todos (todo_id) ON DELETE CASCADE,
    tag_name VARCHAR(128) NOT NULL REFERENCES tags (name) ON DELETE CASCADE,
    UNIQUE (todo_id, tag_name)
);
