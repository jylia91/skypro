public class Maine {

    public static void main(String[] args) {

        int age = 19;
        if (age >= 18 && age < 21) {
            System.out.println("�� ���������� ��������, ����� ������, �� ������������ ��������, ����� ���� ��������");
        }

        if (age < 7 || age > 18) {
            System.out.println("� ����� �� �� ������ � �����");
        }


        int Android = 1;
        if (Android == 1) {
            System.out.println("���������� ������ ���������� ��� Android �� ������");
        }
        double IOS = 1.0;
        if (IOS == 1.0) {
            System.out.println("���������� ������ ���������� ��� IOS �� ������");
        }

        int clientDeviceYearAndroid = 2015;
        if (clientDeviceYearAndroid <= 2015) {
            System.out.println("���������� ������ ��� Android �� ������ ");
            if (clientDeviceYearAndroid >= 2014) {
                System.out.println("���������� ����������� ������ Android �� ������");
            }
        }
        int clientDeviceYearIOS = 2015;
        if (clientDeviceYearIOS <= 2015) {
            System.out.println("���������� ������ ��� IOS �� ������ ");
            if (clientDeviceYearIOS >= 2014) {
                System.out.println("���������� ����������� ������ IOS �� ������");
            }
        }


        int year = 2021;
        if ((year % 4 == 0) && year % 100 != 0) {
            System.out.println(year + "��� �������� ����������");
        } else {
            System.out.println(year + "��� �� �������� ����������");
        }

        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("����������� ���� ���� ��������");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("����������� ��� ��� ��������");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("����������� ��� ��� ��������");
        }

        int monthNumber = 12;
        switch (monthNumber) {
            case 1, 2, 12:
                System.out.println("����� ������");
                break;
            case 3, 4, 5:
                System.out.println("����� ��������");
                break;
            case 6, 7, 8:
                System.out.println("����� ������");
                break;
            case 9, 10, 11:
                System.out.println("����� �������");
                break;
            default:
                System.out.println("��� ������ ������ � �������)");
        }

        int Age = 19;
        int salary = 58_000;
        if (Age >= 23 && salary < 50_000) {
            System.out.println("���� ����� ����� ���� ����� ��");
        }
    }
}
