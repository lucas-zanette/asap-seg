# asap-seg 

	API para cadastrar seguros.
	Utilizando Java 8, SpringBoot, MongoDB e Gradle

	Inicialmente temos duas entidades CLIENTE E APOLICE

	Os Endpoints de "Clientes e "Apolices de Seguro" estão no arquivo JSON que está anexo na primeira release 1.0.0 do GIT.
		Nome do arquivo: (AsapSeguros.postman_collection.json)
		Poderá importá-lo no POSTMAN para realizar as consultas e inclusões no Mongo db

	
	-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-
	
	CLIENTE endpoints
		* Para adicionar clientes
			http://localhost:8080/addCliente
	
		* Para buscar todos clientes
			http://localhost:8080/findAllClientes
			
		* Para buscar um cliente específico
			http://localhost:8080/findAllClientes/[passando o id do cliente]
		
		* Para deletar um cliente
			http://localhost:8080/deleteCliente/607eea7674ed194e3068be97

	-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-	
	
		APOLICE endpoints
			* Para cadastrar uma apólice
				http://localhost:8080/addApolice
				
			* Para buscar todas as apolices
				http://localhost:8080/findAllApolices
			
			* Para consultar uma apólice específica
				http://localhost:8080/findAllApolices/[passando o id/número da apólice]
				
			* Para deletar uma apólice
				http://localhost:8080/deleteApolice/[passando o id/número da apólice]
		
		


