package com.example.demo;

import com.example.demo.i0708.AgilityHero;
import com.example.demo.i0708.Hero;
import com.example.demo.i0708.StrengthHero;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@SpringBootApplication
public class DemoApplication {

    /*
    private static final Map<Integer, Player> PLAYERS = new HashMap<>(){
        {
            // Radiant 래디언트 진영
            put(1, new Player(1, "Aaron", Side.RADIANT, 7, 12, 2, new AgilityHero("Slark")));
            put(2, new Player(2, "Baron", Side.RADIANT, 2, 1, 6, new StrengthHero("Slardar")));
            put(3, new Player(3, "Caron", Side.RADIANT, 4, 4, 4, new AgilityHero("Weaver")));
            put(4, new Player(4, "Daron", Side.RADIANT, 8, 4, 4, new StrengthHero("Huskar")));
            put(5, new Player(5, "Earon", Side.RADIANT, 1, 4, 4, new AgilityHero("Anti-Mage")));
            // Dire 다이어 진영
            put(6, new Player(6, "Faron", Side.DIRE, 0, 5, 9, new StrengthHero("Tiny")));
            put(7, new Player(7, "Garon", Side.DIRE, 7, 4, 2, new StrengthHero("Dragon Knight")));
            put(8, new Player(8, "Haron", Side.DIRE, 4, 3, 1, new StrengthHero("Night Stalker")));
            put(9, new Player(9, "Iaron", Side.DIRE, 8, 2, 2, new AgilityHero("Phantom Lancer")));
            put(10, new Player(10, "Jaron", Side.DIRE, 1, 8, 7, new AgilityHero("Drow Ranger")));
        }
    };*/

    public static void main(String[] args) {

        // 중간 연산자
        // 최종 연산자
        List<Player> playerList = new ArrayList<>(Game.HISTORY.get(0).getPlayers().values());

        System.out.println(" -- Stream.forEach -- ");
        Stream<Player> playerStream = playerList.stream();
//      Stream<String> intermediate = playerList.stream() // Stream<Player> = [Player, Player, Player]
        Map<String, Hero> intermediate = playerList.stream()
                /* Stream<Player> */ .peek(player -> System.out.println(" >> 첫번째 중간 연산자가 실행됩니다 << "))
                /* Stream<Player> */ .filter(player -> player.getSide().equals(Side.RADIANT))
                /* Stream<Player> */ .peek(player -> System.out.println(" >> 두번째 중간 연산자가 실행됩니다 << "))
                /* Stream<Player> */ .filter(player -> player.getKill() >= 5)
                /* Stream<Player> */ .peek(player -> System.out.printf(" >> 세번째 중간 연산자가 실행되기 전 : %s << \n", player))
                /* Stream<Hero>   */ .map(Player::getPickedHero)
//              /* Stream<String> */ .map(Hero::getName) // 실습 내 이거 삭제하고 Stream<Hero> 반환하게 바꾼 뒤 오류 수정하기
//                                   .collect(Collectors.toList()); // 정렬 되어 나옴
//                                   .collect(Collectors.toSet());  // 어떤 순서로 나오는지는 모르지만 섞여나옴
                                    .collect(Collectors.toMap(
                                        (hero) -> hero.getName(),
                                        (hero) -> hero
                                    ));

        System.out.println(" -- 중간 연산자들을 적용 완료 / 이제 최종 연산자를 통해 실행 -- ");
        System.out.println(intermediate);
//      intermediate.forEach(System.out::println);
//      intermediate.forEach((heroName) -> System.out.println(heroName));

        /*
        List<Player> playerList = new ArrayList<>(PLAYERS.values());

        System.out.println("-- Stream.forEach --");
        Stream<Player> playerStream = playerList.stream();

        Stream<String> intermediate = playerList.stream()
                .peek(player -> System.out.println(">> 첫번째 중간 연산자 실행 <<"))
                .filter(player -> player.getSide().equals(Side.RADIANT))
                .peek(player -> System.out.println(">> 두번째 중간 연산자 실행 <<"))
                .filter(player -> player.getKill()>=5)
                .peek(player -> System.out.printf(">> 세번째 중간 연산자가 실행되기 전: %s <<\n", player))
                .map(Player::getPickedHero)
                .map(Hero::getName)
                ;

        intermediate
                .forEach((new Consumer<String>() {
                    @Override
                    public void accept(String heroName) {
                        System.out.println(heroName);
                    }
                }));*/

/*        System.out.println("-- 향상된 for --");
        for (Player player:playerList){
            System.out.println(player);
        }*/
    }
}