package ps.demo.service;

import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Service;

import java.sql.PreparedStatement;
import java.sql.Timestamp;
import java.time.Instant;

@Slf4j
@Service
public class JdbcTemplateService {

    @Qualifier("sndJdbcTemplate")
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Long createTable() {

        String createTable = "create table if not exists bookmarks" +
                "(" +
                "id         bigint PRIMARY KEY AUTO_INCREMENT," +
                "title      varchar   not null," +
                "url        varchar   not null," +
                "created_at timestamp," +
                "primary key (id)" +
                ");";
        jdbcTemplate.execute(createTable);

        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(connection -> {
            String sql = "insert into bookmarks(title, url, created_at) values(?,?,?)";
            PreparedStatement ps = connection.prepareStatement(sql, new String[] { "id" });
            ps.setString(1, "book title");
            ps.setString(2, "book url xxx");
            ps.setTimestamp(3, Timestamp.from(Instant.now()));
            return ps;
        }, keyHolder);
        return (Long) keyHolder.getKey();
    }

}
