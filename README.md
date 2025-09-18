<h1>Algoritmo: Classificador de faixa etária</h1>

<p>Este algoritmo consiste em uma atividade desenvolvida em sala de aula, tendo como principal objetivo a utilização dos conhecimentos adquiridos, como:</p>

<ul>
  <li>A biblioteca Java <code>Scanner</code></li>
  <li>Estruturas condicionais <code>if</code> e <code>else</li>
  <li>Tratamento de exceções com <code>try</code>, <code>catch</code> e <code>finally</code></li>
  <li>Uso do <code>switch-case</code></li>
</ul>

<h2>A execução do código:</h2>

<p>Inicialmente, é pedido ao usuário sua idade:</p>
<img width="524" height="60" alt="entrada idade" src="https://github.com/user-attachments/assets/d3f6e231-8464-48e5-bdc6-b2fc822b3d23" />

<p>Após informar sua idade, será exibida a sua faixa etária, subfaixa e algumas informações adicionais.</p>

<h3>Respostas possíveis:</h3>

<p>Se o usuário digitar a idade dentre 1 a 12 anos, receberá a seguinte resposta:</p>
<img width="667" height="285" alt="faixa etária 1-12 anos" src="https://github.com/user-attachments/assets/73b6a7d0-7549-445d-8ec2-71de08fcc8f6" />

<details>
  <summary>Subfaixas</summary>
  <ol>
    <li>Caso seja menor ou igual a 2, sua respectiva subfaixa será essa:</li>
    <img width="743" height="57" alt="subfaixa 0-2" src="https://github.com/user-attachments/assets/53d4c9ee-877b-4a7b-b8c8-c067e4fe1a33" />
    <li>Caso seja menor ou igual a 5 anos, sua respectiva subfaixa será essa:</li>
    <img width="571" height="70" alt="subfaixa 3-5" src="https://github.com/user-attachments/assets/d0e89c9a-0e60-4334-b520-b3fcf1c53282" />
    <li>Caso o valor esteja dentro da faixa etária e não seja nenhum dos citados anteriormente, a subfaixa será:</li>
    <img width="562" height="59" alt="subfaixa 6-12" src="https://github.com/user-attachments/assets/0505f878-1a51-4e6f-ada3-add4b8e37744" />
  </ol>
</details>

<p>Se o usuário digitar a idade dentre 13 a 17 anos, receberá a seguinte resposta:</p>
<img width="771" height="244" alt="faixa etária 13-17 anos" src="https://github.com/user-attachments/assets/3426e3da-0655-45c8-b5e6-706de372af22" />

<details>
  <summary>Subfaixas</summary>
  <ol>
    <li>Caso seja menor ou igual a 15, sua respectiva subfaixa será essa:</li>
    <img width="628" height="64" alt="subfaixa 13-15" src="https://github.com/user-attachments/assets/5dd4db8f-24fc-4cd4-aab2-16747d203153" />
    <li>Caso seja menor ou igual a 17 anos, sua respectiva subfaixa será essa:</li>
    <img width="701" height="60" alt="subfaixa 16-17" src="https://github.com/user-attachments/assets/a920d38e-5437-4142-88f1-d4fa59180729" />
  </ol>
</details>

<p>Se o usuário digitar a idade dentre 18 a 59 anos, receberá a seguinte resposta:</p>
<img width="742" height="282" alt="faixa etária 18-59 anos" src="https://github.com/user-attachments/assets/e8b9f309-cd23-47fc-907d-fe341711d50c" />

<details>
  <summary>Subfaixas</summary>
  <ol>
    <li>Caso seja menor ou igual a 30, sua respectiva subfaixa será essa:</li>
    <img width="790" height="70" alt="subfaixa 18-30" src="https://github.com/user-attachments/assets/c5f91588-d7c6-489a-842a-5bf4aa9424cb" />
    <li>Caso seja menor ou igual a 45 anos, sua respectiva subfaixa será essa:</li>
    <img width="563" height="63" alt="subfaixa 31-45" src="https://github.com/user-attachments/assets/d54d0d26-c550-41a3-a6d4-cc916f191284" />
    <li>Caso o valor esteja dentro da faixa etária e não seja nenhum dos citados anteriormente, a subfaixa será:</li>
    <img width="701" height="56" alt="subfaixa 46-59" src="https://github.com/user-attachments/assets/c8fcfe34-ea3f-469f-a39b-0bb67018f34d" />
  </ol>
</details>

<p>Se o usuário digitar a idade maior ou igual a 60 anos, receberá a seguinte resposta:</p>
<img width="808" height="285" alt="faixa etária 60+" src="https://github.com/user-attachments/assets/319cadb3-a0db-4255-b017-63e770125a9f" />

<details>
  <summary>Subfaixas</summary>
  <ol>
    <li>Caso seja menor ou igual a 75, sua respectiva subfaixa será essa:</li>
    <img width="680" height="60" alt="subfaixa 60-75" src="https://github.com/user-attachments/assets/ed70c4fd-1418-4688-9cd7-9052c3b14465" />
    <li>Caso seja maior que 75 anos, sua respectiva subfaixa será essa:</li>
    <img width="571" height="64" alt="subfaixa 76+" src="https://github.com/user-attachments/assets/89862e46-31dc-4564-a5ac-6d3dd39341f6" />
  </ol>
</details>

<h2>Mensagens de erro:</h2>

<ol>
  <li>Utilizar apenas números inteiros:</li>
  <img width="645" height="120" alt="erro input inteiro" src="https://github.com/user-attachments/assets/0b405afd-43a6-4160-89c5-d8015514b56d" />
  <li>Apenas números naturais:</li>
  <img width="745" height="85" alt="erro numeros naturais" src="https://github.com/user-attachments/assets/b2fd2ed1-a483-4957-81c6-0c6942092f35" />
  <li>Para idades fictícias:</li>
  <img width="653" height="70" alt="erro idade fictícia" src="https://github.com/user-attachments/assets/e9a0bc62-fbd8-432b-a403-ec9bf5609408" />
</ol>
