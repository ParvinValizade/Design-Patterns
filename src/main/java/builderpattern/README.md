1. Builder design pattern bizə mürəkkəb obyekti(çoxlu dəyişənləri olan classı) sadə obyektlərdən 
istifadə edərək addım addım yaratmağa imkan verir.
   Builder pattern builds a complex object using simple objects and using a step by step approach.
Yəni, tutaq ki, bizim class-ımızın çoxlu dəyişənləri var və biz istəyirik ki bu classın obyektini bir dəfə
yaradandan sonra dəyişmək olmasın. Yəni immutable obyekt olmasını istəyirik. 
Bunun üçün nə edə bilərik? - Set methodlarından imtina edərik və dəyişənlərə dəyər set edə bilmək üçün 
konstructordan istifadə edərik. 
 Amma bu üsül sərfəli deyil. Niyə? 
2. Çünkü tutaq ki bizim User class-ımız var və onun name, surname , age , address , phone adında 5 dənə 
field-i var. İndi durub bu field-lərin 5-ni də biz konstruktura göndərsək, sabah məsələn bizə adamın address-ni 
qeyd elemek lazım olmasa, onda gərək belə edək: User user = new User("Parvin","Valizade","22",null,05555555);
Bunu yazan zaman səhvən address yerinə age dəyişəninə null mənimsətmə halı baş verə bilər. Və ya mənim 20 dəyişənim 
var , sadəcə ilk 10-una dəyər set edəcəm , qalan 10-a null, null, null... yazmaq heç yaxşı yanaşma deyil.
Deyə bilərsiniz ki, onda belə edək, əlavə bir dənə da konstruktor yaradaq , bizə hansı field-lər lazımdısa onları göndərək
həmin konstruktora. İndi düşünək.. Sabah ola bilər ki, bir dəfə bizə 20-dəyişəndən 9-na dəyər mənimsətmək lazım oldu,
bir dəfə 10-na , bir dəfə 16-na ..
Gərək hər biri üçün bir konstruktor yaradaq. Gözəl oldumu ? Olmadı 

3. Bu problemin Builder design pattern ilə həll etmək olar.
 1.Classın içində bir dənə Builder inner class düzəldirik və bu inner class sanki əsas class-ın copy-si olur. 
Yəni eyni field-ləri bu class üçün də yazırıq. 
 2.Həmin dəyişənlərə dəyər set edə bilmək üçün Builder classında hər dəyişən 
üçün ayrıca  Builder tipində method düzəldib dəyər mənimsədirik.
                                            
                                            public Builder door(String d){
                                                   door = d;
                                                   System.out.println("Build door");
                                                   return this;
                                                  }

 3.Sonra inner class olan Builder classının içindəəsass class tipində build() methodu düzəldib geriyə 
 new EsassClass(this) qaytarırıq. 
4. Əsass classın içində private konstruktor düzəldirik ki, qiraqdan kimsə bir başa new EsasClass(); deyib obyekt 
yarada bilmesin. Bu konstructor Builder tipində parametr qəbul edir və esas class-ın dəyişənlərinə Builder classının 
dəyişənləri vasitəsi ilə dəyər mənimsədir.
                              
                             private House(Builder builder) {
                             this.door = builder.door;
                             this.window = builder.window;
                             this.roof = builder.roof;
                             }
İndi rahatlıqla qiraqdan bizə əsass classın hansı dəyişənlərinə dəyər mənimsətmək lazımdısa 
new EssasClass.Builder().istədyimizDeyisənəDəyərMənimsədənMethod().build(); deyib çağıra bilərik.

