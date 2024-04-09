package org.example;

class Product {
    private String name;
    private String description;
    private double price;

    // Constructor'ı private olarak tanımlayarak dışarıdan doğrudan erişimi engellenir
    private Product() {}

    // Builder sınıfı içinde oluşturduğumuz builder metoduyla dışarıdan erişimi sağlanır
    public static Builder builder() {
        return new Builder();
    }

    // Getter
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    // Builder class
    public static class Builder {
        private Product product;

        // Constructor
        private Builder() {
            product = new Product();
        }

        // Setter
        public Builder name(String name) {
            product.name = name;
            return this;
        }

        public Builder description(String description) {
            product.description = description;
            return this;
        }

        public Builder price(double price) {
            product.price = price;
            return this;
        }

        // Oluşturulan ürünü döndürür
        public Product build() {
            return product;
        }
    }
}
