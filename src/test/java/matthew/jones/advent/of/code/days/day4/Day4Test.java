package matthew.jones.advent.of.code.days.day4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day4Test {
    @Test
    void passportCheck() {
        //GIVEN
        String exampleString = "pid:087499704 hgt:74in ecl:grn iyr:2012 eyr:2030 byr:1980\r\n" +
                "hcl:#623a2f\r\n" +
                "\r\n" +
                "eyr:2029 ecl:blu cid:129 byr:1989\r\n" +
                "iyr:2014 pid:896056539 hcl:#a97842 hgt:165cm\r\n" +
                "\r\n" +
                "hcl:#888785\r\n" +
                "hgt:164cm byr:2001 iyr:2015 cid:88\r\n" +
                "pid:545766238 ecl:hzl\r\n" +
                "eyr:2022\r\n" +
                "\r\n" +
                "iyr:2010 hgt:158cm hcl:#b6652a ecl:blu byr:1944 eyr:2021 pid:093154719\r\n" +
                "eyr:1972 cid:100\r\n" +
                "hcl:#18171d ecl:amb hgt:170 pid:186cm iyr:2018 byr:1926\r\n" +
                "\r\n" +
                "iyr:2019\r\n" +
                "hcl:#602927 eyr:1967 hgt:170cm\r\n" +
                "ecl:grn pid:012533040 byr:1946\r\n" +
                "\r\n" +
                "hcl:dab227 iyr:2012\r\n" +
                "ecl:brn hgt:182cm pid:021572410 eyr:2020 byr:1992 cid:277\r\n" +
                "\r\n" +
                "hgt:59cm ecl:zzz\r\n" +
                "eyr:2038 hcl:74454a iyr:2023\r\n" +
                "pid:3556412378 byr:2007";
        Day4 underTest = new Day4(exampleString);
        //WHEN
        int actual = underTest.testPassports();
        //THEN
        assertEquals(4, actual);

    }
}