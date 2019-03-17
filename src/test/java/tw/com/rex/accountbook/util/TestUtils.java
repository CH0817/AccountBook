package tw.com.rex.accountbook.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

public class TestUtils {

    private static ObjectMapper objectMapper = new ObjectMapper();

    public static <T> MockHttpServletRequestBuilder createJsonPostRequest(final String url, final T requestBody) {
        return post(url).characterEncoding(StandardCharsets.UTF_8.toString()).contentType(
                MediaType.APPLICATION_JSON_UTF8).content(TestUtils.object2Json(requestBody));
    }

    private static <T> String object2Json(final T object) {
        try {
            return objectMapper.writeValueAsString(object);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> T jsonToObject(final String jsonString, final Class<T> typeClass) {
        try {
            return objectMapper.readValue(jsonString, typeClass);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
