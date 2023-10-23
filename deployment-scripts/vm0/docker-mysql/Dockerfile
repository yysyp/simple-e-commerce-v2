FROM mysql:5.7

ENV SQL_FILE /docker-entrypoint-initdb.d/init.sql

COPY init.sql ${SQL_FILE}

CMD ["mysqld"] --defaults-file=/etc/mysql/conf.d/docker.cnf", "--initialize-insecure"
