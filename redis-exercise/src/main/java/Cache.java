import redis.clients.jedis.Jedis;

public class Cache {
    public static void main(String[] args) {
        try (
                Jedis jedis = new Jedis("127.0.0.1", 6379, 2000);
        ) {
            jedis.set("page", "hello world");
            System.out.println(jedis.get("page"));
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
