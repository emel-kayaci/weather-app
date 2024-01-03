# Open Weather API

<p><img src="https://github.com/emel-kayaci/weather-app/assets/43893190/380343ab-4633-4cb0-9349-cdf50606af00" width="550" align = center></p>

## **Yukarıdaki mimaride nelere dikkat edilmelidir?**

- Api hangi parametre ile çağırılır?
- Api isteklerini sınırlandıran limitasyonlar var mı? Kaç dakikada bir çağırabilirim? Dakikada kaç istek atabilirim?
- Weather uygulamasının beklenen kullanım miktarı ne kadar? Performans ne kadar önemli bir faktör olacak?

<p><img src="https://github.com/emel-kayaci/weather-app/assets/43893190/c7030897-814b-482c-b874-88e6ea7fdb16" width="800" align = center></p>

- Kullanımı yoğun olursa, mikroservis instance’larını çoğaltabiliriz. Kubernetes tarafında geliştirme ihtiyacı ortaya çıkar.
- Burada da çözülmesi gereken sorun User’ın isteğinin hangi instance’a gitmesidir. Bunun için **load balancer** kullanılır. Load balancer en uygun instance’e yönlendirmeyi Round Robin gibi çeşitli algoritmalarla yapabilir.

## Weather Stack-Api’ın Kısıtları

- Api çağırımlarında header’da api key bilgisi bulunmalıdır.
- 1 ayda maksimum 250 istek yapılabilmektedir.
- Api’dan dönecek cevap 30 dakika içerisinde değişmemektedir.
- 
## Mimari

<p><img src="https://github.com/emel-kayaci/weather-app/assets/43893190/ed75692c-b679-4ff2-b680-69962a6d1b74" width="1000" align = center></p>
