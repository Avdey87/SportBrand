package com.aavdeev.sportbrand;

public class SportBrand {
    private String name;
    private String descriptoin;


    public static final SportBrand[] listBrand = {
            new SportBrand("Nike","Nike, Inc. — американская компания, всемирно известный производитель спортивной одежды и обуви. Штаб-квартира — в городе Бивертон. По мнению аналитиков, на долю компании Nike приходится почти 95 % рынка баскетбольной обуви в США."),
            new SportBrand("Adidas","Adidas AG — немецкий промышленный концерн, специализирующийся на выпуске спортивной обуви, одежды и инвентаря. Генеральный директор компании — Каспер Рорштед"),
            new SportBrand("Reebok","Reebok — международная компания по производству спортивной одежды и аксессуаров. Штаб-квартира расположена в пригороде Бостона Кэнтоне. В настоящее время является дочерним подразделением компании Adidas. ")
    };

    public SportBrand(String name, String descriptoin) {
        this.name = name;
        this.descriptoin = descriptoin;
    }

    public String getName() {
        return name;
    }

    public String getDescriptoin() {
        return descriptoin;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
