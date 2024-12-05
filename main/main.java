package com.aquarium;

public abstract class Fish {
    private String name;
    private String type;
    private double weight;
    private Size size;

    public Fish(String name, String type, double weight, Size size) {
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    public Size getSize() {
        return size;
    }

    @Override
    public String toString() {
        return String.format("Рыба: %s, Тип: %s, Вес: %.2f г, Размер: (Длина: %.2f см, Ширина: %.2f см)",
                name, type, weight, size.getLength(), size.getWidth());
    }

    public abstract void swim();
}
