1. Class-dan asılılıqdan azad oluruq.(Obyektən)

2. Her defe new ClassName() demirik.


3. Gelecekde biz class-ın adını deyişdik(Məsələn AsusV2). 
Bunu qarşı tərəf(client) hiss etməyəcək, o yenə ASUS deyərək müraciət edəcək,
arxada ComputerFactory AsusV2-in obyektini qaytaracaq . Qayda 1-in izahı

4. Ne zaman istifadə edirik? --> FactoryPattern sadəcə ComputerFactory yaradır.
Yəni biz FactoryPattern-i həqiqətən bir fabrik kimi düşünsək, bu fabrik sadəcə 
Computer istehsal edir. 


#Əlavə

Factory Pattern səni obyekt-dən (class-dan ) asılılıqdan azad edir . 
Bu nə deməkdi?- Factory pattern deyir ki, sənə class lazımdısa , hər dəfə new ClassName() deyib yaratma , 
onu hansısa bir adla çağır . Bu sənə hansı üstünlüyü verir ?
Nümunə ilə izah eləməyə çalışacam.Yəni tutaq ki sənin Kompüter fabrikin var və Hp , Asus , Mac və s.
kompüter modelləri istehsal edirsən. Bu HP , Asus , Mac hər birini bir class kimi düşünün. 
Siz ComputerFactory deyə bir class yaradırsınız , hansı ki o class new HP() obyektini "HP" adı 
ilə çağır deyir . Eyni ilə də Asus və Mac-ı. İndi sabahsı günü 
siz durub HP-in versiyasını dəyişdiniz ,  HP classını yox , 
artıq Hp01 classını işlətmək lazımdı. Gedirsiniz , ComputerFactory-də new HP() əvəzinə 
new Hp01() qaytarırsınız , amma ona hələ də hamı "HP" deyib çağırır. 
Yəni client tərəf , daha doğrusu Hp-i classının obyektinə  ehtiyacı olan hamı 
indiyə qədər HP deyib çağırırdı , indi də HP deyib çağıracaq,
arxada ona nə obyekt qayıtdığını bilməyəcək.

Amma belə olmasa idi , gərək o classı istifadə eləyən hamıya deyərdin ki,
qardaş mən uje HP() classını istifadədən çıxardıram , sən Allah harda new HP() demisən onları  
dəyiş new HP01() elə .50 dənə yerdə new HP demişdilərsə , hamsında bir bir dəyişməlidi.

Factory Pattern-in işi bu idi , səni class-dan asılılıqdan azad edir .