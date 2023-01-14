import entities.Game;
import entities.map.Island;
import repository.MapCreator;
import repository.factory.EntityFactory;
import repository.factory.Factory;
import services.GameWorker;
import setting.Config;
import view.ConsoleView;
import view.View;


public class Runner {
    public static void main(String[] args) {
        Config config = Config.getConfig();
        Factory entityFactory = new EntityFactory();
        MapCreator mapCreator = new MapCreator(entityFactory);
        Island island = mapCreator.createIsland(config);
        View view = new ConsoleView(island, entityFactory);
        Game game = new Game(island, entityFactory, view);
        GameWorker gameWorker = new GameWorker(game);
        gameWorker.start();
    }
}
