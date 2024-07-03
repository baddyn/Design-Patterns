public abstract class Color implements Cloneable {
    protected String name;

    abstract void addColor();

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Red extends Color {
    public Red() {
        this.name = "red";
    }

    @Override
    void addColor() {
        System.out.println("Red color added.");
    }
}

public class Blue extends Color {
    public Blue() {
        this.name = "blue";
    }

    @Override
    void addColor() {
        System.out.println("Blue color added.");
    }
}

public class ColorStore {
    private static Map<String, Color> colorMap = new HashMap<String, Color>();

    static {
        colorMap.put("red", new Red());
        colorMap.put("blue", new Blue());
    }

    public static Color getColor(String colorName) {
        return (Color) colorMap.get(colorName).clone();
    }
}

public class PrototypeDemo {
    public static void main(String[] args) {
        ColorStore.getColor("red").addColor();
        ColorStore.getColor("blue").addColor();
    }
}
