package aca.project.interfaceShow;

public final class FigletMenu {
    private static String[] youDraw = {
            "/////////////////////////////////////////////",
            "//.########..########.....###....##......##//",
            "//.##.....##.##.....##...##.##...##..##..##//",
            "//.##.....##.##.....##..##...##..##..##..##//",
            "//.##.....##.########..##.....##.##..##..##//",
            "//.##.....##.##...##...#########.##..##..##//",
            "//.##.....##.##....##..##.....##.##..##..##//",
            "//.########..##.....##.##.....##..###..###.//",
            "/////////////////////////////////////////////"
    };

    private static String[] result = {
            "////////////////////////////////////////////////////////////",
            "//.########..########..######..##.....##.##.......########//",
            "//.##.....##.##.......##....##.##.....##.##..........##...//",
            "//.##.....##.##.......##.......##.....##.##..........##...//",
            "//.########..######....######..##.....##.##..........##...//",
            "//.##...##...##.............##.##.....##.##..........##...//",
            "//.##....##..##.......##....##.##.....##.##..........##...//",
            "//.##.....##.########..######...#######..########....##...//",
            "////////////////////////////////////////////////////////////"
    };

    private static String[] youWin = {
            "/////////////////////////////////////////////////////////////",
            "//.##....##..#######..##.....##....##......##.####.##....##//",
            "//..##..##..##.....##.##.....##....##..##..##..##..###...##//",
            "//...####...##.....##.##.....##....##..##..##..##..####..##//",
            "//....##....##.....##.##.....##....##..##..##..##..##.##.##//",
            "//....##....##.....##.##.....##....##..##..##..##..##..####//",
            "//....##....##.....##.##.....##....##..##..##..##..##...###//",
            "//....##.....#######...#######......###..###..####.##....##//",
            "/////////////////////////////////////////////////////////////"
    };

    private static String[] youLose = {
            "/////////////////////////////////////////////////////////////////////////",
            "//.##....##..#######..##.....##....##........#######...######..########//",
            "//..##..##..##.....##.##.....##....##.......##.....##.##....##.##......//",
            "//...####...##.....##.##.....##....##.......##.....##.##.......##......//",
            "//....##....##.....##.##.....##....##.......##.....##..######..######..//",
            "//....##....##.....##.##.....##....##.......##.....##.......##.##......//",
            "//....##....##.....##.##.....##....##.......##.....##.##....##.##......//",
            "//....##.....#######...#######.....########..#######...######..########//",
            "/////////////////////////////////////////////////////////////////////////"
    };

    static String[] getDraw() {
        return youDraw;
    }

    static String[] getResult() {
        return result;
    }

    static String[] getWin() {
        return youWin;
    }

    static String[] getLose() {
        return youLose;
    }
}
