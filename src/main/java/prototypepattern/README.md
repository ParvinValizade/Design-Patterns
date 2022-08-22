Prototype Design pattern  oxşar obyektləri hər dəfə 'new' demədən eyni obyektin 
copy-sı (clone) alınaraq yaradılmasını təmin edir. Məsələn , oyun hazırladığımızı düşünək,
oyunda 100 əskər varsa , biz onları yaradarkən hər dəfə 'new' demədən, Prototype pattern köməyilə 
sadəcə bir əskər yaradıb ,onun copy-sını alaraq , copy-ların id-lərini dəyişib digər əskərləri yarada 
bilərik. Bunun bizə faydası odur ki, məsələn class-ın 10 paramatetri varsa, biz hər dəfə yeni əskər
yaradanda bu 10 parametri constructor-a göndərməkdən azad oluruq . Eyni zamanda bu 10 parametrin 
dəyərlərini səhvən yeri dəyişik də göndərə bilərik, yəni məsələn 7-ci parametrin dəyərini 8-ciyə
göndərə bilərik.

