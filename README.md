# asap-seg 

	API para cadastrar seguros.
	Utilizando Java 8, SpringBoot, MongoDB e Gradle

	Inicialmente temos duas entidades CLIENTE E APOLICE

	Os Endpoints de "Clientes e "Apolices de Seguro" est�o no arquivo JSON que est� anexo na primeira release 1.0.0 do GIT.
		Nome do arquivo: (AsapSeguros.postman_collection.json)
		Poder� import�-lo no POSTMAN para realizar as consultas e inclus�es no Mongo db

	
	-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-
	
	CLIENTE endpoints
		* Para adicionar clientes
			http://localhost:8080/addCliente
	
		* Para buscar todos clientes
			http://localhost:8080/findAllClientes
			
		* Para buscar um cliente espec�fico
			http://localhost:8080/findAllClientes/[passando o id do cliente]
		
		* Para deletar um cliente
			http://localhost:8080/deleteCliente/607eea7674ed194e3068be97

	-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-	
	
		APOLICE endpoints
			* Para cadastrar uma ap�lice
				http://localhost:8080/addApolice
				
			* Para buscar todas as apolices
				http://localhost:8080/findAllApolices
			
			* Para consultar uma ap�lice espec�fica
				http://localhost:8080/findAllApolices/[passando o id/n�mero da ap�lice]
				
			* Para deletar uma ap�lice
				http://localhost:8080/deleteApolice/[passando o id/n�mero da ap�lice]
		
		


