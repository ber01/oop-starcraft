# oop-starcraft

## 개요

이건 팩토리다.

![](https://velog.velcdn.com/images/ksyj8256/post/1d5098d4-b7bf-4e0a-a4f5-2a447f4a6a86/image.png)

## 시나리오

스타크래프트 세계에서는 팩토리에서 버튼만 누르면 자판기에서 음료수 뽑듯이 탱크도 뽑아준다.

팩토리에는 세 개의 버튼이 있다.

![](https://velog.velcdn.com/images/ksyj8256/post/d5db0ed3-076d-446a-b2d3-a8145f9f7ef2/image.png)

- (V) 누르면 벌처가 나온다.
- (T) 누르면 탱크가 나온다.
- (G) 누르면 골리앗이 나온다.

테란을 대표하는 짐 레이너는 팩토리를 만드는 **레이너 팩토리** 대표다.

짐 레이너만큼 유명한 사라 케리건은 **케리건 팩토리** 대표다.

레이너 팩토리는 돈이 많아서 탱크를 생산할 때 경량화라는 특수한 작업을 해서 이동 속도가 빠르다.

케리건 팩토리는 돈이 없어서 탱크를 생산할 때 추가적인 작업을 하지 못한다.

근처를 지나가던 마린 민씨는 탱크가 가지고 싶어졌다.

- 레이너 팩토리 앞으로 가서 (T)를 누르니까 탱크가 나왔다.
- 케리건 팩토리 앞으로 가서 (T)를 누르니까 탱크가 나왔다.

## 코드

팩토리는 유닛을 생산하는 세 가지의 기능이 있다.

```java
public interface Factory {

    Vulture createVulture();

    Tank createTank();

    Goliath createGoliath();

}
```

레이너 팩토리, 케리건 팩토리가 있다.

```java
public class RaynorFactory implements Factory {

    @Override
    public Vulture createVulture() { ... }

    @Override
    public Tank createTank() { ... }

    @Override
    public Goliath createGoliath() { ... }
}
```

```java
public class KerriganFactory implements Factory {

    @Override
    public Vulture createVulture() { ... }

    @Override
    public Tank createTank() { ... }

    @Override
    public Goliath createGoliath() { ... }
}
```

레이너 팩토리는 탱크를 생산할 때, 경량화 작업을 한다.

```java
@Override
public Tank createTank() {
    RaynorTank tank = new RaynorTank();
    tank.performLightweightOperation();
    return tank;
}
```


민씨가 탱크가 가지고 싶어서 (T)를 누르니까 탱크가 나왔다.

```java
User user = new User(new RaynorFactory());
Tank tank = user.buttonT();
```