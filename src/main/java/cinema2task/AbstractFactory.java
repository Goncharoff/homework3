package cinema2task;

public interface AbstractFactory<T> {
  T create(String type);
}
