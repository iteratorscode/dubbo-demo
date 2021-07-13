package api.generic;

/**
 * 泛化调用接口
 * @implNote
 * 使用场景：
 *  1. 是消费者不希望引入生产者提供的client依赖，只希望关注调用哪个方法，需要传什么参数即可。
 *  2. 是消费者不是使用Java语言，而是使用例如Python语言，那么如何调用使用Java语言生产者提供的服务呢？这时我们可以选择泛化调用。
 * Dubbo泛化调用使用流程
 *  1. 生产者：首先生产者发布服务，这与普通服务发布没有任何区别。
 *  2. 消费者：
 *
 * @author iterators
 * @date 2021/7/13 下午4:08
 */
public interface IHelloService {

    /**
     * 泛化调用接口
     */
    String sayHelloGeneric(String name, String message);
}
