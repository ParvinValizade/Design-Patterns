1. Abstract Factory Pattern-i factory-lərin factory-si kimi düşünmək olar.

2. Factory Pattern-dəki  if else-lerdən azad oluruq, yəni bir başa Obyektin özü ilə işləmirik.

3.Sabahsı günü yeni maşın növü və ya motorcycle növü çıxsa ,createCar() və createMotorCycle() 
methodlarında heç bir dəyişikliyə ehtiyac qalmayacaq.Amma Factory Pattern-də biz getComputer methoduna 
yeni if əlavə etməli idik.


#Əlavə

Abstract Factory Pattern-i factory-lərin factory-si kimi düşünmək olar , bu nə deməkdi? .
Factory pattern real bir Fabrik kimi düşünsək , adətən  bir növ məhsul istehsal edir . 
Amma Abstract Factory Pattern sanki bir fabrikdi , amma əslində altında iki dənə və ya daha çox 
fabrik var . Yəni , tutaq ki, sizin  Maşın Fabrikiniz var , həm Audi markasında, 
həm də BMW markasında (yəni 2 növ ) maşın istehsal edirsiniz.
Yəni qıraqdan baxanda bir dənə maşın fabriki kimi görsənir , 
amma əslində daxildə iki dənə fabrik fəaliyyət göstərir. 
İndi bunu code-la izah eləməyə çalışsaq , sizin fabrik , bir AbstractFactory-di , 
hansı ki içində public abstract Car creatCar(); methodu var  və 
bu AbstractFactory-den extends edən iki dənə classınız var ,
AudiFactory və BMWFactory. AudiFactory createCar () methodunu implantasiya edəndə 
geriyə Audi markasında maşın qaytarır , BMWFactory də BMW markasında.
İndi sual yarana bilər ki,  niyə biz bu createCar() methodunu AbstractFactory-ə atdıq ki , 
elə BMWFactory-də bir dənə yaradaq , AudiFactory-də də bir dənə . 
Məsələ odur ki, bunlar hər iki yekunda maşın istehsal edən fabriklərdi , 
və belə bir qayda var ki, eyni code müxtəlif classlarda təkrarlanırsa (dəyişənlər ola bilər , method və s) . 
Bunu at bir abstract classa , ondan extends elə , day təkrar təkrar yazma . 
Çünki subClass parentCalassın xüsusiyyətlərini daşıya bilir .

Əsasən dediyim vəziyətdə Abstract Factory pattern istifadə olunur , 
bir də orda Factory Patterndəki if-else-lərdən azad olmaq söhbəti var . 
Belə ki,  Factory patterndə bayaq ki , nümunə ilə getsək , 
biz createComputer() methodunda demişdik ki , if sənə "HP" deyə müraciət etsələr new HP() qaytar , 
"Asus" deyə müraciət etsələr new Asus() qaytar , 
sabahsı günü biz Lenovo markasını istehsal etməyə qərara alsaq gərək gedib 
o methodun içinə bir dənə də if else əlavə edək ki, 
Lenova deyə çağırsalar new Lenovo () obyektini qaytar, 
bu da yaxşı hal deyil , nəsə yenilik olanda methodu dəyişmək . 
AbstractFactory də bu halın qarşı alınır , sən məsələn Nissan istehsal eləmək istəsən , 
onu artıq 3-cü fabrik açırsan -NissanFactory classı, o AbstractFactory-dən extends edir , 
və AbstractFactory-nin içindəki Car tipində olan createCar methodunu implantasiya edib , 
geriyə Nissan markasında maşın qaytarır. Yəni sən əvvəl yazılmış heç bir methodu , 
class-i dəyişmirsən. Buna deyirlər open closed prinsipi.
Əlavələrə açıq olsun, dəyişikliklərə qapalı.