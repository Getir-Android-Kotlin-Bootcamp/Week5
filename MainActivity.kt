package com.works.odev5

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.ticker
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.transform
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import java.net.URL

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        ////////////////////////////SAYFA1
        ////////////////////////////SAYFA2
        ////////////////////////////SAYFA3
        ////////////////////////////SAYFA4
        ////////////////////////////SAYFA5

        /*
        //SAYFA 6
        CoroutineScope(Dispatchers.IO).launch {
            delay(10000)
            println("Coroutine Bitti")
        }
        */

        /*
        //SAYFA 7
        val deferred = GlobalScope.async {
            "Hello!"
        }
        runBlocking {
            val mesaj = deferred.await()
            println(mesaj)
        }
        */

        /*
        //SAYFA 8
        runBlocking {
            delay(5000)
            println("Coroutine Bitti")
        }
        */

        /*
        //SAYFA 9
        CoroutineScope(Dispatchers.Main).launch {
            val text = "UI güncellendi!"
        }
        */

        /*
        //SAYFA 10
        CoroutineScope(Dispatchers.IO).launch {
            val url = "https://example.com/api/data"
            val response = URL(url).readText()
            println(response)
        }
        */

        /*
        //SAYFA 11
        CoroutineScope(Dispatchers.Default).launch {
            var sum = 0
            for (i in 0..10000) {
                sum += i
            }
            println("Toplam: $sum")
        }
        */

        /*
        //SAYFA 12
        val url = "https://api.example.com/data"

        CoroutineScope(Dispatchers.IO).launch {
            val response = URL(url).readText()
            println("Veri: $response")
        }

        val scope = CoroutineScope(Dispatchers.IO)

        fun myCoroutine(job: Job) {
            scope.launch {
                withContext(job) {}
            }
        }
        */

        /*
        //SAYFA 13
        val scope = CoroutineScope(Dispatchers.IO)
        val job = Job()

        scope.launch(job) {}
        job.cancel()
        */

        /*

        ///////////////////////// SAYFA 14


        //SAYFA 15
        fun getNumbers(delay: Long): List<Int> {
            val numbers = mutableListOf<Int>()
            for (i in 1..10) {
                Thread.sleep(delay)
                numbers.add(i)
            }
            return numbers
        }

        fun main() {
            val numbers = getNumbers(100)
            for (number in numbers) {
                println(number)
            }
        }
        */

        /*
        //SAYFA 16
        fun getNumbersFlow(delay: Long): Flow<Int> {
            return flow {
                for (i in 1..10) {
                    emit(i)
                    delay(delay)
                }
            }
        }

        fun main() {
            val flow = getNumbersFlow(100)
            launch {
                for (number in flow) {
                    println(number)
                }
            }
        }
        */

        /*
        //SAYFA 17
        val scope = CoroutineScope(Dispatchers.IO)
        scope.launch {}
        */

        /*
        //SAYFA 18
        val supervisorJob = SupervisorJob()
        val scope = CoroutineScope(supervisorJob)

        scope.launch {}
        scope.launch {}
        */

        /*
        //SAYFA 19
        val supervisorJob = SupervisorJob()
        val scope = CoroutineScope(Dispatchers.IO)

        scope.launch {}
        scope.launch {}
        */

        /*
        //SAYFA 20
        val uiScope = CoroutineScope(Dispatchers.Main)

        uiScope.launch {}
        */

        /*
        //SAYFA 21
        val supervisorScope = CoroutineScope(SupervisorJob())

        supervisorScope.launch {}
        */

        /*

        ////////////////////////////SAYFA 22



        //SAYFA 23
        val flow = flow {
            emit(1)
            emit(2)
            emit(3)
        }

        flow.collect { değer -> println(değer) }
        */

        /*
        //SAYFA 24
        val sayilar = listOf(1, 2, 3)
        val flow = sayilar.asFlow()

        flow.collect { değer -> println(değer) }
        */

        /*
        //SAYFA 25
        val sayilarFlow = flow {
            emit(1)
            emit(2)
            emit(3)
        }

        val karelerFlow = sayilarFlow.map { sayi -> sayi * sayi }
        karelerFlow.collect { kare -> println(kare) }
        */

        /*
        //SAYFA 26
        val sayilarFlow = flow {
            emit(1)
            emit(2)
            emit(3)
            emit(4)
            emit(5)
        }

        val teklerFlow = sayilarFlow.filter { sayi -> sayi % 2 == 1 }
        teklerFlow.collect { tek -> println(tek) }
        */

        /*
        //SAYFA 27
        suspend fun performRequest(request: Int): String {
            delay(1000)
            return "response $request"
        }

        fun main() = runBlocking {
            (1..3).asFlow()
                .transform { request ->
                    emit("Making request $request")
                    emit(performRequest(request))
                }
                .collect { response -> println(response) }
        }
        */

        /*
        //SAYFA 28
        val sayilarFlow = flow {
            emit(1)
            emit(2)
            emit(3)
            emit(4)
            emit(5)
        }

        sayilarFlow.flowOn(Dispatchers.IO).collect { sayi -> println(sayi) }
        */

        /*

        ////////////////////////////SAYFA29
        ////////////////////////////SAYFA30


        //SAYFA 31
        fun main() = runBlocking {
            val kanal = Channel<Int>()

            launch {
                kanal.send(10)
            }

            launch {
                val deger = kanal.receive()
                println("Değer alındı: $deger")
            }
        }
        */

        /*
        //SAYFA 32
        fun main() = runBlocking {
            val kanal = Channel<String>()

            launch {
                for (i in 1..5) {
                    kanal.send("Mesaj $i")
                }
            }

            launch {
                while (true) {
                    val mesaj = kanal.receive()
                    println("Mesaj alındı: $mesaj")
                }
            }
        }
        */

        /*
        //SAYFA 33
        fun main() = runBlocking {
            val kanal = ticker(1000, 0)

            launch {
                while (true) {
                    kanal.receive()
                    println("Tıklama alındı")
                }
            }

            delay(5000)
        }
        */
    }
}
